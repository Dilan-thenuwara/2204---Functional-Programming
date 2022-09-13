object q3{

var bank:List[Account]=List()

//Send the parameters of the account to the list

class Account(id:String,n: Int, b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b
override def toString ="["+nic+":"+acnumber +":"+ balance+"]"


def withdraw(a:Double) =this.balance=this.balance-a
def deposit(a:Double) =this.balance=this.balance+a
def transfer(a:Account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
    println(a.balance)
    println(this.balance)


}


}
    

def main(args: Array[String])  = {
    var my=new Account("1",7001,400.0)
    var other=new Account("2",5001,1000.0)

    my.transfer(other,100.0)
    
}




}