# Tipos Genéricos (Generics Type)

Generics é uma classe ou interface parametrizada em relação a tipos. Usamos o simbolo <> onde em seu interior colocamos o tipo. Exemplo de uma classe comum:

---

    public class box {

        private Object object;

        public void set(Object object){
            this.object = object;
        }

        public Object get(){
            return object;
        }
    }

---

Abaixo exemplo da mesma classe porém com o uso de generics:

---
    public class box<T> {

        private T t;

        public void set(T t){
            this.t = t;
        }

        public T get(){
            return t;
        }
    }
---
Nota-se que, tudo o que era Object foi substituído por T

>- E - Elemento.
>- K - Chave.
>- N - Número.
>- T - Tipo.
>- V - Valor.
>- ...

Obs.: os tipos não podem ser tipo primitivo.
 