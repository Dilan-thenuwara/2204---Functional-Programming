def attendees(price:Int):Int=120+(15-price)/5*20

def revenue(price:Int):Int = attendees(price)*price

def cost(price:Int):Int=500+attendees(price)

def profit(price:Int):Int = revenue(price)- cost(price)

def bestPrice(tp:Int):Int=if(profit(tp)>profit(tp+5)) tp else bestPrice(tp+5)

@main
def run():Unit={
    println("The Best Price is Rs." + bestPrice(5))

}
