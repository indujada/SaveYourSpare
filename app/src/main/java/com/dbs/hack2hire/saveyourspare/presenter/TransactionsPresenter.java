package com.dbs.hack2hire.saveyourspare.presenter;

import com.dbs.hack2hire.saveyourspare.model.TransactionDetails;

public class TransactionsPresenter {
    TransactionsView transactionsView;
    TransactionDetails transactionDetails;

    public TransactionsPresenter(TransactionsView transactionsView) {
        this.transactionsView = transactionsView;
        transactionDetails = new TransactionDetails();
    }

    public interface TransactionsView{

    }
}
