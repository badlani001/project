import java.util.*
val sc = Scanner(System.`in`)
class Bank{
    var accno: Int =0
    var name: String=""
    var balance:Int =0

    fun openAcc(){
        print("Enter Your Account number: ")
        accno = sc.nextInt()
        print("Enter your name: ")
        name = readLine().toString()
        print("Enter your balance: ")
        balance = sc.nextInt()
    }
    fun ShowAcc(){
        println(" Your Account number is: $accno")
        println(" Your Name is: $name")
        println(" Your balance is: $balance")
    }
    fun deposit() {
        print("Enter the amount to deposit in your bank account: ")
        var dep: Int
        dep = sc.nextInt()
        balance=balance+dep
    }
    fun withdraw(){
        print("Enter the amount you want to withdraw: ")
        var amt:Int
        amt = sc.nextInt()
        if (amt>balance){
            print("Less balance")
        }
        else{
            balance=balance-amt
        }
    }
}
fun item(){
    var ite:String
    var price:Int
    print("Enter the item: ")
    ite =  readLine().toString()
    print("Enter the price: ")
    price  = sc.nextInt()
    var rec = (ite to price)
    print("Item: ${rec.first} Price: ${rec.second} ")
}
fun main(args: Array<String>){
    print("1.Bank management System ")
    print("2. Item and price records")
    print("Enter Your choice(1-2): ")
    val choice = sc.nextInt()
    if (choice==1) {
        var B1 = Bank()
        B1.openAcc()
        B1.deposit()
        B1.withdraw()
        B1.ShowAcc()
    }
    else{
        item()
    }
}