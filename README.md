Preguntas de comprensión
Responde con tus propias palabras. Hacen parte de los entregables.
1. ¿Qué diferencias hay entre un constructor y un método? Menciona al menos tres.
 Nombre: El constructor se llama igual que la clase. El método puede tener cualquier nombre.
 Retorno: El constructor no devuelve nada (no usa ni void). El método siempre define qué devuelve (un dato o void).
 Ejecución: El constructor corre solo una vez al usar new. El método lo llamas tú de forma manual las veces que quieras.
2. ¿Por qué new Paquete() dejó de compilar en la Etapa 2? ¿Qué harías si la empresa necesitara seguir creando
paquetes sin datos?
 falló porque al crear el propio constructor, Java elimina automáticamente el constructor vacío por defecto la solución es escribir un constructor vacío explícito en la clase o usar sobrecarga llamando a this con valores por defecto
3. ¿Qué ocurriría si en el constructor de Paquete escribieras peso = peso; en lugar de this.peso = peso;? ¿El
programa compilaría?
  Si compila, pero no funciona como el parámetro y el atributo se llaman igual se genera un sombreado al escribir peso = peso, Java le      asigna el valor del parámetro a sí mismo, dejando el atributo de la clase en 0.0. Por eso es obligatorio usar this.peso para              diferenciar    el atributo del parámetro
4. ¿Qué es la firma de un método y por qué el tipo de retorno no sirve para distinguir dos versiones
sobrecargadas?
  La firma es el nombre del método acompañado de la lista ordenada de los tipos de sus parámetros. El tipo de retorno no sirve para         distinguir sobrecargas porque al momento de llamar un método en el código, el compilador solo mira los argumentos que le enviamos; si     dos métodos solo se diferenciaran en el retorno, el compilador no sabría cuál ejecutar y habría una ambigüedad.
5. ¿Qué ventaja tiene que los constructores abreviados de Paquete deleguen con this(...) en lugar de asignar los
atributos ellos mismos?
   La mayor ventaja es evitar repetir código. Si mañana nos toca cambiar una regla o una validación en la asignación, solo tenemos que modificar el constructor completo y los demás constructores abreviados heredan ese cambio automáticamente al delegar en el

