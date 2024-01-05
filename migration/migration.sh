#!/bin/bash

javax="import javax."
jakarta="import jakarta."

function printDots() {
    for i in $(seq 1 3);
    do
      sleep .3
      echo -n "."
    done
}

echo -n "Start migration process"
printDots
echo
echo "execute"

find src -type f | xargs -I@ echo "sed -i 's/$javax/$jakarta/g' @" | bash

resulOfExecute=$?
printDots

if [ $resulOfExecute -eq 0 ];
then
  echo "successfully modified import statements"
else
  echo "errors during modifying"
fi

