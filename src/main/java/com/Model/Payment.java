package com.Model;

import ORM.Anotations.Column;
import ORM.Anotations.ColumnNotRequired;
import ORM.Anotations.Table;

import java.sql.Date;
@Table(name = "payments")
public class Payment {

    @ColumnNotRequired
    @Column(name = "payment_id")
    private final int paymentId;

    @Column(name = "user_id")
    private final int userId;

    @Column(name = "car_serial_num")
    private final int carSerialNum;

    @Column(name = "payment_amount")
    private final double paymentAmount;

    @ColumnNotRequired
    @Column(name = "payment_date")
    private final Date paymentDate;

    public Payment(int paymentId, int userId, int carSerialNum, double paymentAmount, Date paymentDate) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.carSerialNum = carSerialNum;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public Payment(int userId, int carSerialNum, double paymentAmount){
        this.paymentId = 0;
        this.userId = userId;
        this.carSerialNum = carSerialNum;
        this.paymentAmount = paymentAmount;
        this.paymentDate = null;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public int getCarSerialNum() {
        return carSerialNum;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {

        return String.format("%10s\t%10s\t%14s\t%14s\t%13s\t",paymentId,userId,carSerialNum,paymentAmount,paymentDate);
    }
}
