package DevOpsSpark;

import spark.Spark;

public class App {

    public static void main(String[] args) {
        Spark.get("/users/0/welcome", (req, res) -> {return "Hallo Ueli";});           
    }
}
