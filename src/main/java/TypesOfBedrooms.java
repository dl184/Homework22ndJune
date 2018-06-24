public enum TypesOfBedrooms
    {SINGLE(1, "Single"),
        DOUBLE(2, "Double");

    private int capacity;
    private String name;

        TypesOfBedrooms(int capacity, String name) {
            this.capacity = capacity;
            this.name = name;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getName() {
            return name;
        }
    }
