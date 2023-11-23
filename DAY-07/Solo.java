public class Solo<value> {
    private value value;

    Solo(value value){
        this.value = value;
    }

    public value getValue(){return value;}
    public void setValue(value values){this.value = values;}

}