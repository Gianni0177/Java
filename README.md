## Introduzione Interface

---

Le interfacce servono per permettere ad una classe;

```java
public interface Volatile {
    public void volo();
}
//L' interfaccia Volatile contiene il metodo Volo
```
Creo la classe `Ucielo` e ci implemento il metodo `volo`;
```java
public class Ucielo implements Volatile{
    @Override
    public void volo() {
       System.out.println("Ucielo sta volandoo");       
    }   
}
//Se non implemento i metodi della `Interfaccia Volatile` java mi segnala un errore
```



