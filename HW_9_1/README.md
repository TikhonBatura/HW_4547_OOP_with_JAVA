*Дз: добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). 
Создать по два класса наследника Animal, умеющих летать, плавать, бегать. 
При этом добиться того, чтобы не умеющие летать или плавать, не могли этого сделать. 
САМОЕ ВАЖНОЕ! В файле readme.md в репозитории гитхаб описать какие проблемы в таком проектировании Вы увидели, 
а также там же написать возникшие при выполнении дз вопросы.
(если они есть)*

***Комментарии к ДЗ:***

Здравствуйте, Александр,

задание действительно оказалось не сложным как мне казалось изначально.
Первый семинар я смотрел в записи уже после того как был на втором онлайн. 
И подозреваю, что через интерфейсы можно было бы решить проблему.

Больше всего меня смущает, что надо писать много повторяющегося кода. 
В лекции, что-то было вскользь о том как сокращать код, через полиморфизм (надеюсь я не ошибся в термине),
но для меня пока не очень понятно как правильно этим пользоваться.

Ещё у меня была мысль, что можно деть методы "private" или "protected".
Но с private - нельзя вызвать метод внутри main, только если не упаковать его внутрь другого метода.
А protected все равно можно было вызывать у других наследников класса Animal.

Поэтому я решил сделать через **if**, как это было показано на семинаре.