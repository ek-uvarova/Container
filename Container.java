/**
 * Класс контейнер со свойствами elem, size и capacity
 */
public class Container {
    /**Поле массив объектов*/
    private Object[] elem;
    /** Поле размер*/
    private int size;
    /**Поле вместимость*/
    private int capacity;
    /**
     * Конструктор - создание нового объекта
     * @see Container#Container(int)
     */
    public Container(){
        this.capacity = 1;
        this.elem = new Object[capacity];
        this.size = 0;
    }
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param capacity  вместимость
     * @see Container#Container()
     */
    public Container(int capacity) {
        this.capacity = capacity;
        this.elem = new Object[capacity];
        this.size = 0;
    }
    /**
     * Функция получения значения поля {@link Container#elem}
     * @return возвращает элемент по заданному индексу
     */
    public Object getElem(int index){
        if(index < 0 || index > size) {
            return null;
        } else return elem[index];
    }
    /**
     * Функция получения значения поля {@link Container#size}
     * @return возвращает количество элементов в контейнере
     */
    public int getSize(){
        return size;
    }
    /**
     * Функция увеличения вместимости контейнера в 2 раза
     */
    private void expandCapacity() {
        capacity *= 2;
        Object[] newElem = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newElem[i] = elem[i];
        }
        elem = newElem;
    }

    /** Функция добавления элемента в контейнер
     *
     * @param element - элемент, который нужно добавить
     */
    public void add (Object element) {
        if (size == capacity) {
            expandCapacity();
        }
        elem[size] = element;
        size++;
    }

    /** Функция удаления элемента по индексу
     *
     * @param index - индек удаляемого элемента
     */
    public void remove (int index){
        if(index >0 || index < size){
            for(int i = index; i < size; i++){
                elem[index] = elem[index+1];
            }
            size--;
        }
    }

}

