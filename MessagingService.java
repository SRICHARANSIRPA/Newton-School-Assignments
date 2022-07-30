package OOPS.Abstraction;

abstract class MessagingService {
    public String  Secret;
    public String Body;

    public MessagingService(String Body,String Secret){
        this.Body = Body;
        this.Secret= Secret;
    }

    public boolean SendMessageWithSecret() {
        //Encript message with secret
        //this.Body and this.Secret
        //External API To Send Message
        return true;
    }

    public abstract void Send();

}

