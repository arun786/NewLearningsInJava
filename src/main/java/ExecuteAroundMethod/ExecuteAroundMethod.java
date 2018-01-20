package ExecuteAroundMethod;

public class ExecuteAroundMethod {

    public static void main(String[] args) {
        Resource.use(new UseResource() {
            @Override
            public void accept(Resource resource) {
                resource.f1();
                resource.f2();
            }
        });
    }
}

interface UseResource {
    void accept(Resource resource);
}

class Resource {
    private Resource() {
        System.out.println("Created a Resource");
    }

    public void f1() {
        System.out.println("Function f1 called");
    }

    public void f2() {
        System.out.println("Function f2 called");
    }

    public void close() {
        System.out.println("Closed all the resources");
    }

    public static void use(UseResource useResource) {
        Resource resource = new Resource();
        try {
            useResource.accept(resource);
        } finally {
            resource.close();
        }
    }
}
