class Solution:

    # @param A : Represents the elevation map
    # @return  : The total water it is able to trap after raining.

    def trap(self, A):
        n = len(A)
        max_left_height = [None]*n
        max_right_height = [None]*n
        total_water_trapped = 0

        current_bar = 0
        current_left_height = 0
        # Scanning through the array to find the maxLeftHeight for each gap
        while current_bar < n:
            max_left_height[current_bar] = current_left_height
            if current_left_height < A[current_bar]:
                current_left_height = A[current_bar]
            current_bar += 1

        current_bar = n - 1
        current_right_height = 0
        # Scanning through the array to find the maxRightHeight for each gap
        while current_bar >= 0:
            max_right_height[current_bar] = current_right_height
            if current_right_height < A[current_bar]:
                current_right_height = A[current_bar]
            current_bar -= 1

        current_bar = 0
        # Calculating the total water trapped within the gaps
        while current_bar < n:
            total_water_trapped += max(0, min(max_left_height[current_bar], max_right_height[current_bar]) - A[current_bar])
            current_bar += 1

        return total_water_trapped
