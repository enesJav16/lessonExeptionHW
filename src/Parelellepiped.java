
    import java.util.Scanner;

    public class Parelellepiped {

        private int height;
        private int width;
        private int length;

        public Parelellepiped(int height, int width, int length) {
            this.height = height;
            this.width = width;
            this.length = length;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public static void parelellepipedArea(int height,int width,int length){

            System.out.printf("Area of paralellepiped with sides:\nHeight: %d\nWidth: %d\nLength: %d",height,width,length);
            System.out.println("\n-----------------");
            System.out.println("IS: "+(2*((height*length)+(length*width)+(height*width))) +"cm^2");
            System.out.println("================================================");
        }
        public static void parelellepipedVolume(int height,int width,int length){
            System.out.printf("Volume of paralellepiped with sides:\nHeight: %d\nWidth: %d\nLength: %d",height,width,length);
            System.out.println("\n-----------------");
            System.out.println("IS: "+height*width*length+"cm^3");
            System.out.println("================================================");
        }

        public static void paralStart(){
            Scanner scanner = new Scanner(System.in);
            boolean check=true;
            while(check) {
                int heightInput=0;
                int widthInput=0;
                try {
                    System.out.println("Give height(cm):");
                    heightInput = scanner.nextInt();
                    if(heightInput <= 0){
                        System.out.println("Height can't be negative or zero.");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        continue;
                    }
                    System.out.println("Give width(cm):");
                    widthInput = scanner.nextInt();
                    System.out.println("Give length(cm):");
                    int lengthInput = scanner.nextInt();
                    if (  lengthInput <= 0 || widthInput <= 0) {
                        throw new ArithmeticException("Sides can't be negative or zero.");
                    } else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        parelellepipedArea(heightInput, widthInput, lengthInput);
                        parelellepipedVolume(heightInput, widthInput, lengthInput);
                    }
                }
            }
        }
    }


