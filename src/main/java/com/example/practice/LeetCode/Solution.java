package com.example.practice.LeetCode;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String[] words={"i","love", "leetcode", "i", "love", "coding"};
        System.out.println(solution.topKFrequent(words,2));
    }

    /**
     * 判断是否是平衡二叉树
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        boolean flag=false;
        return flag;
    }

    /**
     * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
     *
     * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
     * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
     * 输出: ["i", "love"]
     * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
     *     注意，按字母顺序 "i" 在 "love" 之前。
     * @param words
     * @param k
     * @return
     */
    public List<String> topKFrequent(String[] words, int k) {
        List<String> rec=new LinkedList<>();
        Map<String,Integer> map=new TreeMap<>();
        List<String> wordList = new LinkedList<>(Arrays.asList(words));
        wordList.forEach(i-> map.merge(i, 1, Integer::sum));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            public int compare(String word1, String word2) {
                return map.get(word1).equals(map.get(word2)) ? word1.compareTo(word2) : map.get(word2) - map.get(word1);
            }
        });
        return rec.subList(0, k);
    }
}
