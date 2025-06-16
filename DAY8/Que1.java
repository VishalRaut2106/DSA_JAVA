public class Que1 {

    public static int Linear_Search(String menu[], String key){
        for (int i=0; i<menu.length ; i++){
            if (menu[i] ==key){
                return i;
            }
        }return -1;
    }
    
    public static void main(String[] args) {
        String menu[] = {"dosa","chips","samosa","kachodi","wadapav"};
        String key ="samosa";

        int index = Linear_Search(menu, key);
        if (index == -1){
            System.out.print("Menu Not Found");
        }else{
            System.out.print("Menu is at index: "+index);
        }
    }
}
