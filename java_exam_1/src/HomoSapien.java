public abstract class HomoSapien {
        String name;
        double height;
        double weight;
        int age;

        public HomoSapien(String name, double height, double weight, int age) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }

        public abstract void speak();
    }

