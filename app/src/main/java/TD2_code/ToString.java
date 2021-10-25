package TD2_code;


@FunctionalInterface
interface ToString<T> {
    T convert (T arg);


    ToString<String> listeString = new ToString<>(){
        @Override
        public String convert(String arg){
            return arg.join(arg);                                //à faire 
        }  
    };
}


