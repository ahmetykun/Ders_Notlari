package `2 Basics`

fun main() {

    /**
     *      true ya da false deger atamasi icin kullanilir.
     *      0 ya da 1 Boolean olarak kullanilamaz.
     * **/
    val isStudent: Boolean = true
    val isTeacher: Boolean = false

//   val isStudent2: Boolean = 1
    //val isTeacher2 = 0

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      &&, ve demek ve "and" te kullanınlır
     *      ||, veya demek  yerine "or" da kullanılır
     *      and, or, xor gibi operatorler ile beraber kullanilir.
     * **/
    if (isStudent && isTeacher) {
    println( )
    }

    if (isStudent and isTeacher) {

    }

    if (isStudent || isTeacher) {

    }

    if (isStudent or isTeacher) {

    }

    if (isStudent.or(isTeacher)) {

    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Boolean degerin true olmasini kontrol ettirmek icin == true seklinde kontrole gerek yoktur.
     *      Zaten true ise suslu parantezler icerisine girecektir.
     * **/
    if (isStudent == true) {

    }

    if (isStudent) {

    }

    /**
     *      Ayni sekilde false olmasini kontrol ettirmek icin de == false seklinde kontrole gerek yoktur.
     *      Boolean degiskenin basina ! ifadesini koyarak tersini alabilirsiniz.
     *      Bu durumda false ise suslu parantezlerin icerisine girecektir.
     * **/
    if (isStudent != true) {

    }

//    if (!isStudent) {
//
//    }

    if (isStudent.not()) {

    }

}