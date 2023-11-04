package org.velezreyes.quiz.question6;

import java.util.SplittableRandom;

public class VendingMachineImpl implements VendingMachine,Drink{
  String drink = "";
  boolean fizz ;
  int coins = 0;

  public static VendingMachine getInstance() {
    VendingMachine vending = new VendingMachineImpl();
    return vending;
  }

  @Override
  public void insertQuarter() {
    coins += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    switch (name){
      case "ScottCola":
        if(this.coins<=50) {
          throw new NotEnoughMoneyException();
        }else{
          this.drink = name;
          this.fizz = true;
          this.coins = 0;
        }
        break;
      case "KarenTea":
        if(this.coins<=75) {
          throw new NotEnoughMoneyException();
        }else{
          this.drink = name;
          this.fizz = false;
          this.coins = 0;
        }
        break;
      case "BessieBooze" :
        throw new UnknownDrinkException();
    }

    return this;
  }

  @Override
  public String getName() {
    return this.drink;
  }

  @Override
  public boolean isFizzy() {
    return this.fizz;
  }
}
