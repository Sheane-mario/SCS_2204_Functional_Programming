class Account(var balance: Double) {
  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    withdraw(amount)
    toAccount.deposit(amount)
  }
}

def negativeBalances(bank: List[Account]): List[Account] = {
  bank.filter(_.balance < 0)
}

def totalBalance(bank: List[Account]): Double = {
  bank.map(_.balance).sum
}

def applyInterest(bank: List[Account]): List[Account] = {
  bank.map { account =>
    val interest = if (account.balance >= 0) 0.05 else -0.1
    account.balance += account.balance * interest
    account
  }
}
