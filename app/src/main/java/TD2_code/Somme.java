package TD2_code;

@FunctionalInterface
interface Somme<T> {
    T calc(T arg1, T arg2);


Somme<Integer> additionEntier = new Somme<>(){
    @Override 
    public Integer calc(Integer arg1, Integer arg2){
        return arg1 + arg2;
    }
};

Somme<Double> additionDouble = new Somme<>(){
    @Override 
    public Double calc(Double arg1, Double arg2){
        return arg1 + arg2;
    }
};

Somme<Long> additionLong = new Somme<>(){
    @Override 
    public Long calc(Long arg1, Long arg2){
        return arg1 + arg2;
    }
};

Somme<String> additionString = new Somme<>(){
    @Override 
    public String calc(String arg1, String arg2){
        return arg1 + arg2;
    }
};

}
