function sortPeople(names: string[] = ["Mary", "John", "Emma"], heights: number[] = [180, 165, 170]): string[] {
    for (let i = 0; i < heights.length; i++) {
            if (heights[i] < heights[i+1]) {
                console.log(heights[i]);
                console.log("\t",heights[i+1],"\n");
                
                let temp1 = heights[i];
                let temp2 = names[i];
                heights[i] = heights[i+1];
                names[i] = names[i+1];
                heights[i+1] = temp1;
                names[i+1] = temp2;
            }
    }
    console.log(names);


    return []
};
sortPeople()
// function sortPeople(names: string[] = ["Mary", "John", "Emma"], heights: number[] = [180, 165, 170]): string[] {
//     for (let i = 0; i < heights.length; i++) {
//         for (let j = i + 1; j < heights.length; j++) {
//             if (heights[i] < heights[j]) {
//                 console.log(heights[i]);
//                 console.log("\t",heights[j],"\n");
                
//                 let temp1 = heights[i];
//                 let temp2 = names[i];
//                 heights[i] = heights[j];
//                 names[i] = names[j];
//                 heights[j] = temp1;
//                 names[j] = temp2;
//             }
//         }
//     }
//     console.log(names);


//     return []
// };
// sortPeople()