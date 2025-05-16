 
# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй
`feature/conflict-demo`-ийг `develop` руу merge хийхэд `Multiplication.java` дээр merge conflict гарсан.  
Conflict нь `multiply()` функцын Javadoc коммент дээр байсан:
- `feature/conflict-demo`: "Multiply two numbers (conflict version A)"
- `develop`: "Multiply two double values (conflict version B)"

## Шийдвэрлэлтийн Алхмууд
1. Онцлог салбарт `git merge develop` ажиллуулсан
2. Git conflict үүссэнийг мэдэгдсэн
3. `Multiplication.java` дээрх конфликт хэсгийг гараар засварласан
4. `git add src/main/java/labxx/sict/must/edu/mn/Multiplication.java`
5. `git commit` ажиллуулж merge-ийг дуусгасан
6. `git push`, дараа нь GitHub дээр PR үүсгэж, merge хийсэн
