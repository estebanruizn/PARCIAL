class Alcancia {

    var moneda_20 = 0;
    var moneda_50 =0;
    var moneda_100 =0;
    var moneda_200=0;
    var moneda_500=0;
    var total_dinero =0;

    fun agregarMoneda(){
        println("1. $20")
        println("2. $50")
        println("3. $100")
        println("4. $200")
        println("5. $500")
        println("¿Que denomonación de monedas va a agregar?")
        var moneda = readln().toInt()
        if (moneda==1) {
            println("Cuantas va a agregar")
            var moneda20 = readln().toInt()
            moneda_20 += moneda20
            var total_moneda = moneda_20*20
            this.total_dinero+= total_moneda
            println("Se ha agregado las monedas")
        }else if(moneda==2){
            println("Cuantas va a agregar")
            var moneda50 = readln().toInt()
            moneda_50 += moneda50
            var total_moneda = moneda_50*50
            this.total_dinero+= total_moneda
            println("Se ha agregado las monedas")
        }else if(moneda==3){
            println("Cuantas va a agregar")
            var moneda100 = readln().toInt()
            moneda_100 += moneda100
            var total_moneda = moneda_100*100
            this.total_dinero+= total_moneda
            println("Se ha agregado las monedas")
        }else if(moneda==4){
            println("Cuantas va a agregar")
            var moneda200 = readln().toInt()
            moneda_200 += moneda200
            var total_moneda = moneda_200*200
            this.total_dinero+= total_moneda
            println("Se ha agregado las monedas")
        }else if(moneda==5){
            println("Cuantas va a agregar")
            var moneda500 = readln().toInt()
            moneda_500 += moneda500
            var total_moneda = moneda_500*500
            this.total_dinero+= total_moneda
            println("Se ha agregado las monedas")
        }

    }

    fun contarMonedas() {
        println("El total de monedas de $20 es: $moneda_20")
        println("El total de monedas de $50 es: $moneda_50")
        println("El total de monedas de $100 es: $moneda_100")
        println("El total de monedas de $200 es: $moneda_200")
        println("El total de monedas de $500 es: $moneda_500")
    }

    fun calcularDinero(){
        println("El total del dinero ahorrado es de: ${total_dinero}")
    }

    fun romperAlcancia(){
        moneda_20 = 0
        moneda_50 = 0
        moneda_100 = 0
        moneda_200 = 0
        moneda_500 = 0
        total_dinero = 0
        println("Se ha roto la alcancia")
    }

    fun nuevaAlcancia() {
        moneda_20 = 0
        moneda_50 = 0
        moneda_100 = 0
        moneda_200 = 0
        moneda_500 = 0
        total_dinero = 0
        println("Se creo una nueva alcancia")
    }

}