-- -- Enter your code here. Read input from STDIN. Print output to STDOUT
-- You are given a 2D matrix, a, of dimension MxN and a positive integer R. You have to rotate the matrix R times and print the resultant matrix. Rotation should be in anti-clockwise direction.

-- Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to shift elements by one step only (refer sample tests for more clarity).
-- language haskell

-- Enter your code here. Read input from STDIN. Print output to STDOUT
import Data.List

rotate :: (Integral a, Integral b) => (b,b) -> b -> ((b,b),a) -> ((b,b),a)
rotate (m,n) k ((r,c), v) = (rot (r,c) shift, v)
  where
    sim x xc = if x < div xc 2 then x else xc-1-x
    ring = min (sim r m) (sim c n)
    width = n - 2*ring
    height = m - 2*ring
    period = 2*(width + height - 2)
    shift = mod k period
    top = ring
    bottom = m - 1 - ring
    left = ring
    right = n - 1 - ring
    rot (r,c) 0 = (r,c)
    rot (r,c) k
      | r == top && c > left      = rot (r,c-1) (k-1)
      | c == left && r < bottom   = rot (r+1,c) (k-1)
      | r == bottom && c < right  = rot (r,c+1) (k-1)
      | c == right && r > top     = rot (r-1,c) (k-1)

rotateMatrix :: [[Int]] -> Int -> [[Int]]
rotateMatrix m r = wrap $ map (rotate (rows,cols) r) (unwrap m)
  where
    rows = length m
    cols = length $ head m
    unwrap mx = [((i,j), (mx !! i) !! j) | i <- [0..rows-1], j <- [0..cols-1]]
    wrap lx = chop cols $ map snd $ sort lx
      where
        chop _ [] = []
        chop w xs = take w xs : chop w (drop w xs)

main :: IO ()
main = do
  l <- getLine
  let [_,_,r] = map read $ words l
  c <- getContents
  let mx = map (map read . words) (lines c)
  putStr $ unlines $ map (unwords . map show) (rotateMatrix mx r)
