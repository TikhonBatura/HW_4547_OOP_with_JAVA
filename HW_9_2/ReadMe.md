1. Create/Update interface:
   - Soundable:
   - Swimable;
   - Flyable;
   - Runable.


2. Interfaces implements to next Classes:
   * Swimable -> Duck, Dolphin;
   * Flyable -> Duck, Eagle;
   * Soundable -> Eagle, WildCat;
   * Runable -> WildCat, Fox;
   

3. Create methods by interfaces for Doctor and Nurse.


4. Create method in VetClinic file, which show 
   who can:
   * fly;
   * run;
   * swim;
   * make noise.

**Вопросы**:
к сожалению сейчас очень ограничен во времени с основной работой и семьей. 
Не эксперемнтировал сам, но возник вопрос можно прописать методот в интерфейсе, чтобы он выводил что-то типа: 
"CLASS_NAME + run with speed %d" а уже внутри класса в этом методе вместо переменных заполнялись значения от класса?

Так же стало интересно, можно ли внутри одного класса вызвать метод от другого класса.
Например: внутри класса доктор, существует метод укол, 
который выззывает класс метдсестру и метод укол внутри класса медсестра?
