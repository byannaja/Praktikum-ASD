+---------------------------------------------------------------------------------+
|                                   Mahasiswa                                     |
+---------------------------------------------------------------------------------+
| - nim   : String                                                                |
| - nama  : String                                                                |
| - prodi : String                                                                |
| - kelas : String                                                                |
+---------------------------------------------------------------------------------+
| + Mahasiswa(nim: String, nama: String, prodi: String, kelas: String)            |
| + tampilkanData(): void                                                         |
+---------------------------------------------------------------------------------+

+---------------------------------------------------------------------------------+
|                                 AntrianKRS                                      |
+---------------------------------------------------------------------------------+
| - data             : Mahasiswa[]                                                |
| - front            : int                                                        |
| - rear             : int                                                        |
| - size             : int                                                        |
| - max              : int                                                        |
| - totalSudahKRS    : int                                                        |
| - kuotaDPA         : int                                                        |
+---------------------------------------------------------------------------------+
| + AntrianKRS(n: int)                                                            |
| + isEmpty()        : boolean                                                    |
| + isFull()         : boolean                                                    |
| + tambahAntrian(mhs: Mahasiswa): void                                           |
| + panggilProsesKRS(): void                                                      |
| + tampilkanSemua() : void                                                       |
| + tampilkanDuaTerdepan(): void                                                  |
| + tampilkanPalingAkhir(): void                                                  |
| + cetakStatistik() : void                                                       |
| + clear()          : void                                                       |
+---------------------------------------------------------------------------------+