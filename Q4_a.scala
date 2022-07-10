def normal(n:Int) = n*250

def OverTime(ot:Int) = ot*85

def Tax(full:Int) = full*0.88

@main
def run()={
    var Full= normal(40) + OverTime(30)
    println("Take home salary is Rs." + Tax(Full))
}