package com.moneyvalue.domain

sealed class  Transaction (val amount: Double, val Desciprtion : String)

case class Credit() extends Transaction (val amount: Double, val Desciprtion : String)
case class Debit(val amount: Double, val Desciprtion : String) extends Transaction (amount, Desciprtion)