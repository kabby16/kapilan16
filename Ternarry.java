class Operators {
    public static void main(String args[]) {
        boolean isLoggedIn = false;
        boolean isConnectedToInternet = false;

        String result = isConnectedToInternet 
                        ? (isLoggedIn ? "User Logged In" : "User not Logged In") 
                        : "Turn on the internet";

        System.out.println(result);
    }
}