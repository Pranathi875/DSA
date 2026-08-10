class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);

        long sum = 0;
        long prev = 0;

        for (int num : nums) {

            if (num - prev > 1) {

                long first = prev + 1;
                long last = num - 1;
                long count = last - first + 1;

                long take = Math.min(count, (long) k);

               
                long actualLast = first + take - 1;

                sum += (first + actualLast) * take / 2;

                k -= take;

                if (k == 0) {
                    return sum;
                }
            }

            prev = num;
        }

       
        long first = prev + 1;
        long last = prev + k;

        sum += (first + last) * k / 2;

        return sum;
    }
}
