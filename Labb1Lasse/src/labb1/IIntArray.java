package labb1;

public interface IIntArray {
    /**
     * Interface for handling an array of integers.
     */

        /**
         * Get the average value of the entire array.
         * @return Average.
         */
        double getAverage() throws ArrayExeption;
        /**
         * Find and return all positions where an element's value is <val>.
         * @param val Value to find positions for.
         * @return Positions.
         */
        int[] findPositions(int val) throws ArrayExeption;
        /**
         * Append a value after the last element.
         * @par
         */
        void appendLast(int value) throws ArrayExeption;
        /**
         * Insert a value at position <pos>.
         * @param pos
         * @param value
         */
        void insertAt(int pos, int value) throws ArrayExeption;
        /**
         * Get value at position <pos>.
         * @param pos
         * @return value.
         */
        int getAt(int pos) throws ArrayExeption;
        /**
         * Set a new value at position <pos>.
         * @param pos
         * @param element
         */
        void setAt(int pos, int element) throws ArrayExeption;
        /**
         * Delete element at position <pos>.
         * Return the deleted element's value.
         * @param pos
         * @return
         */
        int deleteAt(int pos) throws ArrayExeption;
    }

