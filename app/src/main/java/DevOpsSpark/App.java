/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DevOpsSpark;

import spark.Spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Spark.get("/users/0/welcome", (req, res) -> {
            return "Hallo Ueli";
        });
    }
}
