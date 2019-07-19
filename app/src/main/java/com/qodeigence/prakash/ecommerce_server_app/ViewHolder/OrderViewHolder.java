package com.qodeigence.prakash.ecommerce_server_app.ViewHolder;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.qodeigence.prakash.ecommerce_server_app.R;

@TargetApi(Build.VERSION_CODES.M)
public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress,txtOrderDate,txtpincode,txtUserName,txtMail;
    public Button btnEdit,btnRemove,btnDetail,btnDirection,btnCall;
    public CardView cardView;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txtOrderAddress = itemView.findViewById(R.id.order_address);
        txtOrderPhone = itemView.findViewById(R.id.order_phone);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderDate = itemView.findViewById(R.id.order_date);
        txtpincode = itemView.findViewById(R.id.pin_code);
        txtUserName = itemView.findViewById(R.id.user_name);
        txtMail = itemView.findViewById(R.id.order_mail);
        cardView = itemView.findViewById(R.id.order_card_view);

        btnEdit = itemView.findViewById(R.id.btnEdit);
        btnRemove = itemView.findViewById(R.id.btnRemove);
        btnDetail = itemView.findViewById(R.id.btnDetail);
        btnDirection = itemView.findViewById(R.id.btnDirection);
        btnCall = itemView.findViewById(R.id.btnCall);



    }

}
