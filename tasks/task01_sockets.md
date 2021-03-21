# *Sockets* en Java

Analitzarem un codi a mode d'exemple per a la conexió Servidor-Client mitjançant els *sockets* de java.

## exemple01

 * El **servidor** escolta pel port 5555 i volca a la std out els missatjes rebuts. Utilitza un *buffer* per rebre missatges de 256 bytes.

 * El **client** escriu un missatge pel port 5555 i es tancat.

## Tasques

1. Averigua la teva IP i intercanvia un missatge amb un company de classe.

2. Modificar el codi:
    * *Client*: que llegeixi de la `std in` *n* frases a enviar, una en cada línea. La primera línea indica quants missatge es volen enviar.
    ```txt
    2
    Primer missatge
    Segon missatge, més llarg
   
    ```
   * *Servidor*: que el servidor mostri per pantalla tots els misstges que s'han rebut
    
## Indicacions

* Utiltiza el redireccionament de la `std in` del IDE.
* Per llegir de la `std in` utilitza un `Scanner`, i `.nextLine()`.
* Recorda deixar una línea en blanc al final de l'arxiu on escriuras les frases.
* al servidor he utiltizat la funció `read()`

## Execució 
* L'execució de dos programes des del IDE s'ha de fer amb compte.
* Jo he fet:
    * Compilar el projecte (Build)
    * Des del Terminal executar 1r el servidor i 2n el client. (Important executar i posar en background el Servidor ja que és un procés que es quedarà en estat d'espera)
    ```txt
    java SocketServidorStream.java&
    java SocketClienteStream.java < msgs.txt

    ```