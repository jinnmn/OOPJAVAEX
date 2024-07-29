public class Service {
        Input input = new Input();
        private CalcComplex cA = input.getA();
        private CalcComplex cB = input.getB();
        public final String[] symbolls = new String[] {       
            "+",
            "-",
            "*",
            "/"
        };
        View view = new View();
        Logger logger = new Logger();  
        
        private CalcComplex calculate(String x) {
            switch (x) {
                case "+":
                    return cA.Add(cB);
                case "-":                    
                    return cA.Sub(cB);
                case "*":                    
                    return cA.Mult(cB);
                case "/":                    
                     return cA.Div(cB);
                default:
                    throw new IllegalArgumentException("Seriously?!");       
            } 
            

        }
        private String soutStringBuild(String x ) {
            return String
            .format("Complex   cA %s cB = %s\n"
            , x, calculate(x));
        }

        private String soutNumStringBuild() {
            String res = new String();
            
            for (CalcComplex c : input.getNums() ) {
                res = res + String
                .format("cA = %s", c) 
                + "\n";
            }
            return res;
        }

        public void printConsole() {
            view.soutNums(soutNumStringBuild());
            for (String x : symbolls) {
                view.soutC(soutStringBuild(x)); 
            }
            
        }

        public void printLogs() {
            logger.soutC(soutNumStringBuild());
            for (String x : symbolls) {
                logger.soutC(soutStringBuild(x));
            }
        }
        
}

