or (int i = 0; i < arr.length; i++) {
            //check for element at every index if it = to target
            int element=arr[i];
            if (element==target) {
                return i;
            }
        }