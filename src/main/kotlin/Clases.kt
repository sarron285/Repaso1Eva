//clase personaje con los valores añadidos dentro del parentesis ("constructor")
class Personaje(
    private var nombre : String,
    private var vida : Int,
    private var fuerza : Int,
    private var defensa : Int
){
//ser y get correspondiente po cada atributo para poder acceder a ellos
    fun getNombre():String{
        return nombre
    }

    fun setNombre(nombre: String){
        this.nombre=nombre
    }

    fun getVida():Int{
        return vida
    }

    fun setVida(vida:Int){
        this.vida=vida
    }

    fun getFuerza():Int{
        return fuerza
    }

    fun setFuerza(fuerza: Int){
        this.fuerza=fuerza
    }

    fun getDefensa():Int{
        return defensa
    }

    fun setDefensa(defensa:Int){
        this.defensa=defensa
    }



}

//clase KaerMorhen con sus correspondientes metodos.
class KaerMorhen (){

    //Lista de personajes:


    val listaPersonaje = mutableListOf("personaje1", "personaje2", "personaje3", "personaje4")



    fun Entrar (personaje5:Personaje){
        listaPersonaje.add("personaje5")
    }

    fun SalirPersonaje(nombre: Personaje){
       //usas directamente el personaje
        listaPersonaje.forEach(){

       }
        listaPersonaje.remove()
    }

    fun SalirNombre (nombre: String){
        //tienes que buscar en el personaje
    }
    fun Habitacion(nombre: Personaje){
    }

    fun Entrenamiento(nombre: Personaje){
    }


class Menu(){
    //pedir por teclado
    print("Elija una de las 4 opciones:")
    val respuesta = readln().toInt()
}
}