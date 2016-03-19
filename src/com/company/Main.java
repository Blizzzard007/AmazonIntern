package com.company;

import java.util.*;

public class Main {
    protected Suit suit;


    public static void main(String[] args) {
        /**Random r = new Random();
        int High = 10;
        int Low = 8;
        int result = r.nextInt(High-Low) + Low;
        Anagrams aa = new Anagrams();
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(aa.GroupAnagrams(s));

        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        BinaryTreeZigzag bb = new BinaryTreeZigzag();
        rootSum rr = new rootSum();
        System.out.println(rr.rootsum(n1));
        System.out.println(rr.inorder(n1));
        System.out.println(rr.halfsum(n1));
        int[] nums = {1,2,3,4};
        PermutationAmazon pp = new PermutationAmazon();
        System.out.println(pp.permutation(nums));
        CompareVersionNum cc = new CompareVersionNum();
        cc.compareVersion("1.1.0.7","1.1");
        int[] nums={3,4,-1,1};
        findMissingPositive ss = new findMissingPositive();
        System.out.println(ss.firstMissingPositive(nums));*/


//        ConvertTreeToDoublyLinkedList dd = new ConvertTreeToDoublyLinkedList();
//        DoublyNode root;
//        root = new DoublyNode(10);
//        root.left = new DoublyNode(12);
//        root.right = new DoublyNode(15);
//        root.left.left = new DoublyNode(30);
//        root.right.left = new DoublyNode(36);
////        dd.binaryTreeToDoublylist();
//        dd.binaryTreeToList(root);
//        dd.binaryTreeToDoublylist();
//
//        String beginWord = "hit";
//        String endWord = "cog";
//        Set<String> set = new HashSet<>();
//        set.add("hot");
//        set.add("dot");
//        set.add("dog");
//        set.add("lot");
//        set.add("log");
//        WordLadder wordLadder = new WordLadder();
//        WordLadder2 ladder2 = new WordLadder2();
//        String start = "hit";
//        String end = "cog";
//        String[] arr = {"hot","dot","dog","lot","log"};
//        Set<String> dict = new HashSet<String>(Arrays.asList(arr));
//        System.out.println(new WordLadder2().findLadders(start, end, dict).toString());
//        countNumberof1bits bb = new countNumberof1bits();
//        System.out.println(bb.countNumberof1bits(5));
//        isPrime isp = new isPrime();
//        isp.previousNthprime(100);

        longestSubstring ll = new longestSubstring();
        String s ="anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqub" +
                "irkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnh" +
                "pnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkzn" +
                "qxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlru" +
                "pvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulho" +
                "byhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvab" +
                "thpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysf" +
                "ujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzl" +
                "azuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwn" +
                "bsdonucaipoafavmlrrlplnnbsaghbawo" +
                "oabsjndqnvruuwvllpvvhuepmqtprgktnwxmfl" +
                "mmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwi" +
                "muizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukp" +
                "vosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasi" +
                "wmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg";
        System.out.println(ll.longestPalindrome(s));




//        System.out.println(bb.ZigzagTraversal(n1));

//        String s="1211";
//        String s="111221";
//        //Given you a string,how do you transfer this string to  111221;
//
//        StringBuilder sb = new StringBuilder();
//        int count = 1;
//        String str1 = "";
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i)==s.charAt(i - 1)){
//                count++;
//            }else{
//                sb.append(count).append(s.charAt(i-1));
//                /**
//                 * i=1,count = 2
//                 * i=2,count = 3
//                 * i=3,sb = 31
//                 * i=4 count = 2
//                 * i=5 sb=3122
//                 * i=6 sb=312211
//                */
//                count = 1;
//            }
//        }
//        str1 = sb.append(count).append(s.charAt(s.length()-1)).toString();
//        System.out.println(str1);

       /** arrayLengthEncoding aa = new arrayLengthEncoding();
        int[] test = new int[]{1,1,1,0,0,1,1,0,1};

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<test.length;i++){
            sb.append(test[i]);
        }
        String s = sb.toString();
        StringBuilder sb1 = new StringBuilder();

        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i - 1)){
                count++;
            }else{
                sb1.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }
        String str = sb1.append(s.charAt(s.length()-1)).append(count).toString();
        //String stttt = sb.toString();
        System.out.println(str);



        for(int n: aa.encodeLength(test)) {
            System.out.print(n);
        }*/

        ContainDuplicate con = new ContainDuplicate();
        int[] nums = {1,2,3,4,5,6,6};
        System.out.println(con.containsNearbyAlmostDuplicate(nums,3,0));
        /**List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        /**
         * 1 2 3
         * 4 5
         * 6 7 8 9
         *
         *
         *

        list2.add(4);
        list2.add(5);

        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);

        Iterator list11=list1.listIterator();
        Iterator list12=list2.listIterator();
        Iterator list13=list3.listIterator();

        List<Iterator<Integer>> res = new ArrayList<Iterator<Integer>>();
        res.add(list11);
        res.add(list12);
        res.add(list13);

        KzigzagIterator zz = new KzigzagIterator(res);
        for(int i=0;i<list1.size()+list2.size()+list3.size();i++) {
            System.out.println(zz.next());
        }

         */









        // write your code here
    }
}
