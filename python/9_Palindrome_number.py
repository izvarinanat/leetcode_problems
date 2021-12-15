class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x>=0:
            x_str = str(x)
            if len(x_str) == 1:
                return True
            for i in range(len(x_str)//2):
                if x_str[i] != x_str[-(i+1)]:
                    return False
            return True
        return False



solution = Solution()
print(solution.isPalindrome(0))
