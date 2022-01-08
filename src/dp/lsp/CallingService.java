package dp.lsp;

public interface CallingService {

    void startVideoChat(String friendName); // WhatsApp, Facebook

    void groupCall(String... friends); // WhatsApp, Facebook
}
