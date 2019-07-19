package com.qodeigence.prakash.ecommerce_server_app.Service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
// import com.google.firebase.iid.FirebaseInstanceIdService;
import com.qodeigence.prakash.ecommerce_server_app.Common.Common;
import com.qodeigence.prakash.ecommerce_server_app.Model.Token;

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    /**
     * @deprecated
     */
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        if (Common.currentUser != null)
            updateToServer(refreshedToken);
    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token token = new Token(refreshedToken,true); //bcoz this is server side
        tokens.child(Common.currentUser.getPhone()).setValue(token);
    }
}