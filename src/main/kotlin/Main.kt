import java.util.Scanner

fun main(args: Array<String>) {

    val alcancia1 = Alcancia()



    for (x in 1..50){
        println("1. Agregar monedas")
        println("2. Contar monedas")
        println("3. Calcular dinero ahorrado")
        println("4. Romper alcancia")
        println("5. Comenzar nueva alcancia")
        println("Ingrese una opcion")
        var opc = readln().toInt()
        if (opc==1){
            alcancia1.agregarMoneda()
        }else if (opc==2){
            alcancia1.contarMonedas()
        }else if (opc==3){
            alcancia1.calcularDinero()
        }else if(opc==4){
            alcancia1.romperAlcancia()
        }else if(opc==5){
            alcancia1.nuevaAlcancia()
        }else{
            println("Digite una opcion valida")
        }
    }




}