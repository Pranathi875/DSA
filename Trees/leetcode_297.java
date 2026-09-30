public class Codec {

   
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode root, StringBuilder sb) {

        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");

        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

   
    public TreeNode deserialize(String data) {

        String arr[] = data.split(",");
        int index[] = {0};

        return deserializeHelper(arr, index);
    }

    public TreeNode deserializeHelper(String arr[], int index[]) {

        if (arr[index[0]].equals("#")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[index[0]]));
        index[0]++;

        root.left = deserializeHelper(arr, index);
        root.right = deserializeHelper(arr, index);

        return root;
    }
}
