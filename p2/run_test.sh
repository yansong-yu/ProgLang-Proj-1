RED="\033[31m"
GREEN="\033[32m"
RESET="\033[0m"
for mytest in ./proj2-mytest/*
do
  echo -e "${GREEN}###Run test $mytest${RESET}"
  ./plan $mytest
done

for test in ./proj2-test/*
do
  echo -e "${GREEN}###Run test $test${RESET}"
  ./plan $test
done
