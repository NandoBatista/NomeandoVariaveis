import java.util.*

fun main(args: Array<String>) {

    var nome = " "
    var idade = 0
    var emprego = " "
    var nacionalidade = " "
    var tipoSanguineo = " "
    var nascimento = 0
    var leitura = Scanner(System.`in`)


    print("Digite o seu nome de usuário: ")
    nome = leitura.next()

    print("Informe a sua idade: ")
    idade = leitura.nextInt()
    //Informando a idade acima e o cálculo para saber o ano de nascimento, logo abaixo.
    nascimento = 2021 - idade

    print("Qual a sua preferência de emprego? ")
    emprego = leitura.next()

    print("Qual a sua nacionalidade? ")
    nacionalidade = leitura.next()

    print("Qual o seu tipo sanguíneo? ")
    tipoSanguineo = leitura.next()

    println("O seu nome é $nome, você é do(a) $nacionalidade, e nasceu no ano de $nascimento. Você tem pretensão de trabalhar" +
            " como $emprego, e seu tipo sanguíneo é $tipoSanguineo.")
}
