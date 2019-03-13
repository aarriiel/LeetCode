//Runtime: 24 ms, faster than 92.00% of Java online submissions for Median of Two Sorted Arrays.
//Memory Usage: 50 MB, less than 8.03% of Java online submissions for Median of Two Sorted Arrays.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=0;
        int n2=0;
        int mid1=0;
        int mid2=0;
        int pre=0;
        double ans=0.0;
        int leng=nums1.length+nums2.length;
        if(leng%2==1)
            mid2=leng/2+1;
        else{
            mid1=leng/2;
            mid2=leng/2+1;
        }
        while(n1<nums1.length||n2<nums2.length){
            if(n1<nums1.length&&n2<nums2.length){
                if(nums1[n1]<nums2[n2]){
                    pre=nums1[n1];
                    n1++;
                }
                else{
                    pre=nums2[n2];
                    n2++;
                }
            }
            else if(n1==nums1.length){
                pre=nums2[n2];
                n2++;
            }
            else{
                pre=nums1[n1];
                n1++;
            }
            if(n1+n2==mid2&&leng%2==1){
                ans=pre;
                break;
            }
            else if(n1+n2==mid2&&leng%2==0){
                ans=(ans+pre)/2;
                break;
            }
            else if(n1+n2==mid1&&leng%2==0){
                ans=pre;
            }
        }
        return ans;
    }
}