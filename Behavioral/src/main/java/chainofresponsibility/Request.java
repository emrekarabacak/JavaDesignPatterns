package chainofresponsibility;

public class Request {
    private RequestType requestType;
    private double amout;

    public Request(RequestType requestType, double amout) {
        this.requestType = requestType;
        this.amout = amout;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmout() {
        return amout;
    }
}
