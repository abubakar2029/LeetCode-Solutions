// function findTheDifference(s: string = "a", t: string = "aa"): string {
//     let array1: string[] = s.split("");
//     let array2: string[] = t.split("");
//     for (let i = 0; i < array1.length; i++) {
//         const index = array2.indexOf(array1[i]);
//         // console.log(`Inde${index}\t element${array2[index]}`);
//         if (index !== -1) {
//             // if (array2.includes(array1[i])) {
//             array2.splice(index, 1)
//             // console.log(`Splicing ${array2[i]}`);
//             // additional += array2[i]
//         }

//     }
//     return array2.toString();
// };

// console.log(findTheDifference());

// console.log(`aa-a`);
function aho(s: string, t: string): string {
    for (let i = 0; i < t.length; i++) {
        if (t[i].localeCompare(s[i])) {

        }
    }
    return ''
}
console.log(aho("aa", "a"));
