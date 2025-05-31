const fs = require('fs');
const path = require('path');

// Root directory to scan (you can change this)
const rootDir = './'; // current directory
const outputFile = 'collected_java_code.txt';

// Function to walk through directories
function walkDir(currentPath, callback) {
    fs.readdirSync(currentPath).forEach(file => {
        const filePath = path.join(currentPath, file);
        const stat = fs.statSync(filePath);

        if (stat.isDirectory()) {
            walkDir(filePath, callback);
        } else if (filePath.endsWith('.java')) {
            callback(filePath);
        }
    });
}

// Main function
function collectJavaFiles() {
    let collectedContent = '';

    walkDir(rootDir, (filePath) => {
        const relativePath = path.relative(rootDir, filePath);
        const content = fs.readFileSync(filePath, 'utf8');

        collectedContent += `// ========================================\n`;
        collectedContent += `// File: ${relativePath}\n`;
        collectedContent += `// ========================================\n`;
        collectedContent += content + '\n\n';
    });

    fs.writeFileSync(outputFile, collectedContent, 'utf8');
    console.log(`✅ All Java files have been collected into "${outputFile}"`);
}

collectJavaFiles();